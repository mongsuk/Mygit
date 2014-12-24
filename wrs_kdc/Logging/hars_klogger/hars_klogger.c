#include <stdio.h>
#include <sys/klog.h>

#include <log/log.h>
#include <android/log.h>

#define DEFAULT_TAG ANDROID_LOG_INFO
#define KERNEL_LOG_TAG "kernel"
#define BUFFER_SIZE 512

int main(void) {
    char *buffer, *tmp;
    int read_size;
    int written_size;

    buffer = (char *) malloc(BUFFER_SIZE + 1);

    if (!buffer) {
        fprintf(stderr, "Failed to alloc memory\n");
        return -1;
    }

    __android_log_buf_write(LOG_ID_KERNEL, DEFAULT_TAG, KERNEL_LOG_TAG,
            "Start to log kernel message");

    while (1) {
        tmp = buffer;
        read_size = klogctl(KLOG_READ, buffer, BUFFER_SIZE);

        if (read_size < 0) {
            fprintf(stderr, "Failed to read kernel log\n");
            return -1;
        }

        tmp[read_size] = '\0';

        while(read_size > 0) {
            written_size = __android_log_buf_write(LOG_ID_KERNEL,
                    DEFAULT_TAG, KERNEL_LOG_TAG, tmp);
            tmp += written_size;
            read_size -= written_size;
        }
        tmp = buffer;
    }
    return 0;
}

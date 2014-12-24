#include <utils/Log.h>
#include <stdio.h>

int main(void) {

    int ERROR = 6;//Log.e

    __android_log_buf_write(LOG_ID_KERNEL, ERROR, "KERNEL", "Test Buffer");
    printf("test\n");
    return 0;
}

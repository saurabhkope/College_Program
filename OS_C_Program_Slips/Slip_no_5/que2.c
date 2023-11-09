// Q.2 Write the simulation program to implement demand paging and show the page scheduling
// and total number of page faults for the following given page reference string. Give input n as the
// number of memory frames. Reference String: 3, 4, 5, 6, 3, 4, 7, 3, 4, 5, 6, 7, 2, 4, 6
// i. Implement FIFO

#include <stdio.h>

int main() {
    int page_reference_string[] = {3, 4, 5, 6, 3, 4, 7, 3, 4, 5, 6, 7, 2, 4, 6};
    int n, i;
    
    printf("Enter the number of memory frames: ");
    scanf("%d", &n);
    
    int memory_frames[n];
    int page_queue[n];
    int page_faults = 0;

    for (i = 0; i < n; i++) {
        memory_frames[i] = -1;
        page_queue[i] = -1;
    }

    for (i = 0; i < sizeof(page_reference_string) / sizeof(page_reference_string[0]); i++) {
        int page = page_reference_string[i];
        int found = 0;

        for (int j = 0; j < n; j++) {
            if (memory_frames[j] == page) {
                found = 1;
                break;
            }
        }

        if (!found) {
            page_faults++;

            if (page_queue[0] != -1) {
                int replaced_page = page_queue[0];
                for (int j = 0; j < n; j++) {
                    if (memory_frames[j] == replaced_page) {
                        memory_frames[j] = page;
                        break;
                    }
                }

                for (int j = 0; j < n - 1; j++) {
                    page_queue[j] = page_queue[j + 1];
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (memory_frames[j] == -1) {
                        memory_frames[j] = page;
                        break;
                    }
                }
            }

            for (int j = 0; j < n - 1; j++) {
                page_queue[j] = page_queue[j + 1];
            }

            page_queue[n - 1] = page;
        }

        printf("Page Reference: %d\n", page);
        printf("Memory Frames: ");
        for (int j = 0; j < n; j++) {
            printf("%d ", memory_frames[j]);
        }
        printf("\nPage Queue: ");
        for (int j = 0; j < n; j++) {
            printf("%d ", page_queue[j]);
        }
        printf("\n\n");
    }

    printf("Total Page Faults: %d\n", page_faults);

    return 0;
}

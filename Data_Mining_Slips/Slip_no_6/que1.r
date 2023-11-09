# Q1. Write a R programto create a data frame using two given vectors and displaythe duplicate
# elements.

# Create two vectors
vector1 <- c(1, 2, 3, 4, 5, 6, 2, 8, 9, 10)
vector2 <- c("A", "B", "C", "D", "E", "F", "A", "H", "I", "J")

# Create a data frame
my_data_frame <- data.frame(Vector1 = vector1, Vector2 = vector2)

# Display the duplicate elements
duplicates <- my_data_frame[duplicated(my_data_frame) | duplicated(my_data_frame, fromLast = TRUE), ]
print(duplicates)

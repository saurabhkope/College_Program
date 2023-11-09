# Q1. Write a R program to create a data frame from four given vectors

# Define four vectors
vector1 <- c(1, 2, 3, 4, 5)
vector2 <- c("A", "B", "C", "D", "E")
vector3 <- c(10.5, 20.5, 30.5, 40.5, 50.5)
vector4 <- c(TRUE, FALSE, TRUE, FALSE, TRUE)

# Create a data frame from the vectors
df <- data.frame(
  int_num = vector1,
  char = vector2,
  float_num = vector3,
  boolean = vector4
)

# Display the data frame
print(df)

# Q1. Write a R program to calculate the sum of two matrices of given size

# Define the size of the matrices
rows <- 3
cols <- 3

# Create two example matrices
matrix1 <- matrix(1:9, nrow = rows, ncol = cols)
matrix2 <- matrix(9:1, nrow = rows, ncol = cols)

# Calculate the sum of the matrices
sum_matrix <- matrix1 + matrix2

# Print the original matrices and their sum
cat("Matrix 1:\n")
print(matrix1)

cat("Matrix 2:\n")
print(matrix2)

cat("Sum of the matrices:\n")
print(sum_matrix)

# Q1.Write a R program to add, multiply and divide two vectors of integer type.(vector length
# should be minimum 4)

# Create two integer vectors of the same length (minimum 4)
vector1 <- c(5, 10, 15, 20)
vector2 <- c(2, 4, 5, 8)

# Perform vector addition
addition_result <- vector1 + vector2
cat("Vector Addition Result: ", addition_result, "\n")

# Perform vector multiplication
multiplication_result <- vector1 * vector2
cat("Vector Multiplication Result: ", multiplication_result, "\n")

# Perform vector division
division_result <- vector1 / vector2
cat("Vector Division Result: ", division_result, "\n")

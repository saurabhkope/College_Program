# Q1. Write a R program to get the first 20 Fibonacci numbers

# Initialize the first two Fibonacci numbers
fibonacci <- c(0, 1)

# Calculate and print the first 20 Fibonacci numbers
for (i in 3:20) {
  next_fib <- fibonacci[i-1] + fibonacci[i-2]
  fibonacci <- c(fibonacci, next_fib)
}

# Print the first 20 Fibonacci numbers
cat("The first 20 Fibonacci numbers are:\n")
cat(fibonacci, sep = " ")

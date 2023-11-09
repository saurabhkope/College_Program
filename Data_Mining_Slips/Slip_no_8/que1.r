# Q1. Write a R program to get the first 10 Fibonacci numbers.

# Function to generate the first 10 Fibonacci numbers
get_first_10_fibonacci <- function() {
  n <- 10  # Number of Fibonacci numbers to generate
  fibonacci <- numeric(n)
  
  if (n >= 1) {
    fibonacci[1] <- 0
  }
  if (n >= 2) {
    fibonacci[2] <- 1
  }
  
  for (i in 3:n) {
    fibonacci[i] <- fibonacci[i - 1] + fibonacci[i - 2]
  }
  
  return(fibonacci)
}

# Get and print the first 10 Fibonacci numbers
fibonacci_numbers <- get_first_10_fibonacci()
cat("First 10 Fibonacci numbers:", paste(fibonacci_numbers, collapse = ", "))

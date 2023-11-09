# Q1. Write a R program to reverse a number and also calculate the sum ofdigits of that
# number.(i don't know how to run this r program)


# Function to reverse a number
reverse_number <- function(number) {
  reversed <- 0
  while (number > 0) {
    digit <- number %% 10
    reversed <- reversed * 10 + digit
    number <- number %/% 10
  }
  return(reversed)
}

# Function to calculate the sum of digits of a number
sum_of_digits <- function(number) {
  sum_digits <- 0
  while (number > 0) {
    digit <- number %% 10
    sum_digits <- sum_digits + digit
    number <- number %/% 10
  }
  return(sum_digits)
}

# Input the number
number <- as.integer(readline("Enter a number: "))

# Reverse the number
reversed <- reverse_number(number)

# Calculate the sum of digits
sum_digits <- sum_of_digits(number)

# Print the results
cat("Reversed Number:", reversed, "\n")
cat("Sum of Digits:", sum_digits, "\n")

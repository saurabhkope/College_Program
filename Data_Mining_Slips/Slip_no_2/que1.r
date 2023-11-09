# Q1. Write an R program to calculate the multiplication table using afunction

# Function to generate a multiplication table
multiplication_table <- function(number, limit) {
  for (i in 1:limit) {
    result <- number * i
    cat(paste(number, "x", i, "=", result), "\n")
  }
}

# Input the number for which you want the multiplication table
number <- as.integer(readline("Enter a number for the multiplication table: "))

# Input the limit for the table
limit <- as.integer(readline("Enter the limit for the multiplication table: "))

# Call the function to generate and print the multiplication table
multiplication_table(number, limit)

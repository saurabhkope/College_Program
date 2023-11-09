# Q1. Write an R program to create a Data frames which contain details of 5 employees and display
# summary of the data

# Create a data frame with details of 5 employees
employee_data <- data.frame(
  EmployeeID = c(1, 2, 3, 4, 5),
  Name = c("saurabh", "yogesh", "arbaj", "pranav", "hrushali"),
  Age = c(30, 28, 32, 25, 34),
  Department = c("HR", "Engineering", "Finance", "Marketing", "Sales"),
  Salary = c(50000, 60000, 55000, 48000, 65000)
)

# Display the summary of the data frame
summary(employee_data)

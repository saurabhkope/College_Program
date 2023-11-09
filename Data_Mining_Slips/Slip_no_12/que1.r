# Q1. Write a R program to create a Dataframes which contain details of 5employees and
# display the details.
# Employee contain (empno,empname,gender,age,designation)

# Create a DataFrame for employee details
employee_data <- data.frame(
  empno = c(1, 2, 3, 4, 5),
  empname = c("saurabh", "pranav", "yogesh", "hrushali", "arbaj"),
  gender = c("Male", "Male", "Male", "Female", "Male"),
  age = c(20, 20, 20, 20, 20),
  designation = c("Manager", "Engineer", "Analyst", "Manager", "Designer")
)

# Display the employee details
print(employee_data)

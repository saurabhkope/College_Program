# Q1. Write a script in R to create a list of employees (name) and perform thefollowing:
# a. Display names of employees in the list.
# b. Add an employee at the end of the list
# c. Remove the third element of the list.

# Create a list of employees' names
employees <- list("saurabh", "pranav", "hrushali", "yogesh")

# a. Display names of employees in the list
print(employees)

# b. Add an employee at the end of the list
new_employee <- "arbaj"
employees <- c(employees, new_employee)
print(employees)

# c. Remove the third element of the list
removed_employee <- employees[3]
employees <- employees[-3]

print(removed_employee)
print(employees)

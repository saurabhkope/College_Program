# Q1. Write aR program to create a Dataframes which contain details of 5 Studentsand display the
# details.
# Students contain (Rollno,Studname,Address,Marks) 

# Create a data frame with student details
students_data <- data.frame(
  Rollno = c(1, 2, 3),
  Studname = c("saurabh", "yogesh", "arbaj"),
  Address = c("wagholi", "pune", "hadapsar"),
  Marks = c(78, 92, 88)
)

# Display the details of the students
print(students_data)

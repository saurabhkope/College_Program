# Q2. Write a Python program to read “StudentsPerformance.csv” file. Solvefollowing:
# - To display the shape of dataset.
# - To display the top rows of the dataset with their columns.Note: Download
# dataset from following link :
# (https://www.kaggle.com/spscientist/students-performance-inexams?
# select=StudentsPerformance.csv) 

import pandas as pd

# Load the dataset from the CSV file
df = pd.read_csv("StudentsPerformance.csv")

# Display the shape of the dataset (number of rows and columns)
print("Shape of the dataset:", df.shape)

# Display the top rows of the dataset with their columns
print("Top rows of the dataset:")
print(df.head())

# Q2. Write a Python program build Decision Tree Classifier forshows.csvfrom pandas and 
# predict class label for show starring a 40 years old American comedian, with 10 
# years of experience, and a comedy ranking of 7? Create a csv file as shown in
# https://www.w3schools.com/python/python_ml_decision_tree.asp

import pandas as pd
from sklearn.tree import DecisionTreeClassifier

# Load the dataset from "shows.csv"
data = pd.read_csv("shows.csv")

# Preprocess the data: Map 'Nationality' to numeric values
data['Nationality'] = data['Nationality'].apply(lambda x: 1 if x == 'American' else 0)

# Define features and target variable
X = data[['Age', 'Nationality', 'Experience', 'Rank']]
y = data['Go']

# Create a Decision Tree Classifier
clf = DecisionTreeClassifier()

# Fit the classifier to the data
clf = clf.fit(X, y)

# Create an input data for prediction
input_data = pd.DataFrame({'Age': [40], 'Nationality': [1], 'Experience': [10], 'Rank': [7]})

# Predict the class label
predicted_label = clf.predict(input_data)

# Create a DataFrame to store the input and predicted label
result_df = pd.DataFrame({'Age': input_data['Age'],
                          'Nationality': ['American' if input_data['Nationality'].values[0] == 1 else 'Other'],
                          'Experience': input_data['Experience'],
                          'Rank': input_data['Rank'],
                          'Predicted Label': predicted_label})

# Save the result to a CSV file
result_df.to_csv('predicted_show_label.csv', index=False)

print("Predicted Label:", predicted_label)
print("Result saved to predicted_show_label.csv")

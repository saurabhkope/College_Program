# Q2. Write a Python program build Decision Tree Classifier using Scikit- learn package for
# diabetes data set (download database from https://www.kaggle.com/uciml/pimaindians-diabetes-database)

import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score, classification_report

# Load the dataset
diabetes_data = pd.read_csv("diabetes.csv")  # Replace with the actual path to the dataset

# Split the data into features (X) and the target variable (y)
X = diabetes_data.drop("Outcome", axis=1)
y = diabetes_data["Outcome"]

# Split the data into training and testing sets (e.g., 70% train, 30% test)
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)

# Create a Decision Tree Classifier
clf = DecisionTreeClassifier(random_state=42)

# Fit the classifier to the training data
clf.fit(X_train, y_train)

# Make predictions on the test data
y_pred = clf.predict(X_test)

# Evaluate the model's performance
accuracy = accuracy_score(y_test, y_pred)
report = classification_report(y_test, y_pred)

# Print the results
print("Accuracy:", accuracy)
print("\nClassification Report:\n", report)



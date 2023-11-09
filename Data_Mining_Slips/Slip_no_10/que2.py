# Q2. Write a Python Programme to read the dataset (“Iris.csv”). dataset download from
# (https://archive.ics.uci.edu/ml/datasets/iris) and apply Apriori algorithm. 

import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score

# Read the Iris dataset
data = pd.read_csv("iris.csv")

# Split the data into features (X) and target labels (y)
X = data.drop("species", axis=1)
y = data["species"]

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)

# Create a Random Forest Classifier
clf = RandomForestClassifier(n_estimators=100, random_state=42)

# Train the model
clf.fit(X_train, y_train)

# Make predictions
y_pred = clf.predict(X_test)

# Calculate accuracy
accuracy = accuracy_score(y_test, y_pred)
print("Accuracy:", accuracy)

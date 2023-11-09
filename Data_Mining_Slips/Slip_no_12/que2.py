# Q2. Write a python program to implement multiple Linear Regression modelfor a car dataset.
# Dataset can be downloaded from:
# https://www.w3schools.com/python/python_ml_multiple_regression.asp

import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

# Load the dataset from data.csv
df = pd.read_csv('data.csv')

# Split the data into features (X) and the target (y)
X = df[['Volume', 'Weight']]
y = df['CO2']

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Create and fit a linear regression model
model = LinearRegression()
model.fit(X_train, y_train)

# Make predictions
y_pred = model.predict(X_test)

# Model evaluation
mse = mean_squared_error(y_test, y_pred)
r2 = r2_score(y_test, y_pred)

print("Coefficients:", model.coef_)
print("Intercept:", model.intercept_)
print("Mean Squared Error (MSE):", mse)
print("R-squared (R2):", r2)

# Q2. Write a python program to implement multiple Linear Regression modelfor a car dataset.
# Dataset can be downloaded from:
# https://www.w3schools.com/python/python_ml_multiple_regression.asp

import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

# Load the car dataset from the CSV file
data = pd.read_csv("car_data.csv")

# Define the features (independent variables) and the target variable (dependent variable)
X = data[['Weight', 'Volume']]
y = data['CO2']

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Create a multiple linear regression model
model = LinearRegression()

# Fit the model to the training data
model.fit(X_train, y_train)

# Make predictions on the test data
y_pred = model.predict(X_test)

# Calculate Mean Squared Error
mse = mean_squared_error(y_test, y_pred)

# Calculate R-squared
r_squared = r2_score(y_test, y_pred)

# Display the model coefficients (b0, b1, b2)
b0 = model.intercept_
b1, b2 = model.coef_

print("Model Coefficients:")
print(f"Intercept (b0): {b0:.4f}")
print(f"Weight (b1): {b1:.4f}")
print(f"Volume (b2): {b2:.4f}")

print(f"Mean Squared Error (MSE): {mse:.4f}")
print(f"R-squared (R2): {r_squared:.4f}")

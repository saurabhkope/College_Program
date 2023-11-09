# Q2. Consider the following observations/data. And apply simple linear regression and find out
# estimated coefficients b1 and b1 Also analyse theperformance of the model
# (Use sklearn package)
# x = np.array([1,2,3,4,5,6,7,8])
# y = np.array([7,14,15,18,19,21,26,23]) 

import numpy as np
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

# Given data
x = np.array([1, 2, 3, 4, 5, 6, 7, 8])
y = np.array([7, 14, 15, 18, 19, 21, 26, 23])

# Reshape the data (required by scikit-learn)
x = x.reshape(-1, 1)
y = y.reshape(-1, 1)

# Create a Linear Regression model
model = LinearRegression()

# Fit the model to the data
model.fit(x, y)

# Get the estimated coefficients
b0 = model.intercept_[0]
b1 = model.coef_[0][0]

# Make predictions using the model
y_pred = model.predict(x)

# Calculate the performance metrics
mse = mean_squared_error(y, y_pred)
r2 = r2_score(y, y_pred)

# Print the results
print("Estimated Coefficients:")
print(f"Intercept (b0): {b0}")
print(f"Slope (b1): {b1}")

print("\nPerformance Metrics:")
print(f"Mean Squared Error (MSE): {mse}")
print(f"R-squared (R2): {r2}")

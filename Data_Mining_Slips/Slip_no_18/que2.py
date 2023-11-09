# Q2. Consider the following observations/data. And apply simple linear regression and find out
# estimated coefficients b1 and b1 Also analyse theperformance of the model
# (Use sklearn package)
# x = np.array([1,2,3,4,5,6,7,8])
# y = np.array([7,14,15,18,19,21,26,23])

import numpy as np
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

# Input data
x = np.array([1, 2, 3, 4, 5, 6, 7, 8])
y = np.array([7, 14, 15, 18, 19, 21, 26, 23])

# Reshape x to a 2D array
x = x.reshape(-1, 1)

# Create a linear regression model
regression_model = LinearRegression()

# Fit the model to the data
regression_model.fit(x, y)

# Get the estimated coefficients
b0 = regression_model.intercept_
b1 = regression_model.coef_[0]

# Make predictions
y_pred = regression_model.predict(x)

# Calculate Mean Squared Error
mse = mean_squared_error(y, y_pred)

# Calculate R-squared
r_squared = r2_score(y, y_pred)

print(f"Estimated Coefficient b0 (Intercept): {b0:.4f}")
print(f"Estimated Coefficient b1 (Slope): {b1:.4f}")
print(f"Mean Squared Error (MSE): {mse:.4f}")
print(f"R-squared (R2): {r_squared:.4f}")

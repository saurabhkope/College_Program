# Q2. Write a python programme to implement multiple linear regression modelfor stock market
# data frame as follows:
# Stock_Market = {'Year':
# [2017,2017,2017,2017,2017,2017,2017,2017,2017,2017,2017,2017,2016,2
# 016,20,16,2016,2016,2016,2016,2016,2016,2016,2016,2016],
# 'Month': [12, 11,10,9,8,7,6,5,4,3,2,1,12,11,10,9,8,7,6,5,4,3,2,1],
# 'Interest_Rate': [2.75,2.5,2.5,2.5,2.5,2.5,2.5,2.25,2.25,2.25,2,2,2,1.75,1.75,1.75,1.75,1.75,1
# .75,1.75,1.75,1.75,1.75,1.75],
# 'Unemployment_Rate':
# [5.3,5.3,5.3,5.3,5.4,5.6,5.5,5.5,5.5,5.6,5.7,5.9,6,5.9,5.8,6.1,6.2,6.1,6.1,6.1,5
# .9,6.2,6.2,6.1],
# 'Stock_Index_Price': [1464,1394,1357,1293,1256,1254,1234,1195,1159,1167,1130,1075,1047,
# 965,943,958,971,949,884,866,876,822,704,719] }
# And draw a graph of stock market price verses interest rate.


import pandas as pd
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression

# Define the stock market data
Stock_Market = {
    'Year': [2017, 2017, 2017, 2017, 2017, 2017, 2017, 2017, 2017, 2017, 2017, 2017, 2016, 2016, 2016, 2016, 2016, 2016, 2016, 2016, 2016, 2016, 2016, 2016],
    'Month': [12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1],
    'Interest_Rate': [2.75, 2.5, 2.5, 2.5, 2.5, 2.5, 2.5, 2.25, 2.25, 2.25, 2, 2, 2, 1.75, 1.75, 1.75, 1.75, 1.75, 1.75, 1.75, 1.75, 1.75, 1.75, 1.75],
    'Unemployment_Rate': [5.3, 5.3, 5.3, 5.3, 5.4, 5.6, 5.5, 5.5, 5.5, 5.6, 5.7, 5.9, 6, 5.9, 5.8, 6.1, 6.2, 6.1, 6.1, 6.1, 5.9, 6.2, 6.2, 6.1],
    'Stock_Index_Price': [1464, 1394, 1357, 1293, 1256, 1254, 1234, 1195, 1159, 1167, 1130, 1075, 1047, 965, 943, 958, 971, 949, 884, 866, 876, 822, 704, 719]
}

# Create a DataFrame from the data
df = pd.DataFrame(Stock_Market)

# Extract the features and target variable
X = df[['Interest_Rate']]
y = df['Stock_Index_Price']

# Create and fit the linear regression model
model = LinearRegression()
model.fit(X, y)

# Predict stock market prices
predicted_prices = model.predict(X)

# Plot the actual and predicted prices against interest rate
plt.figure(figsize=(10, 6))
plt.scatter(X, y, color='blue', label='Actual Prices')
plt.plot(X, predicted_prices, color='red', label='Predicted Prices')
plt.xlabel('Interest Rate')
plt.ylabel('Stock Index Price')
plt.legend()
plt.title('Stock Market Price vs. Interest Rate')
plt.show()

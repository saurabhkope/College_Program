# Q2. Write a python program to implement k-means algorithm to build prediction model (Use
# Credit Card Dataset CC GENERAL.csv Download from kaggle.com)
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.cluster import KMeans

# Load the credit card dataset
data = pd.read_csv("CCGENERAL.csv")

# Preprocess the data (e.g., handle missing values and scaling)
# You may need to customize this part based on your specific dataset and analysis goals.

# Select the features you want to use for clustering (e.g., "PURCHASES" and "CASH_ADVANCE")
X = data[["PURCHASES", "CASH_ADVANCE"]]

# Choose the number of clusters (k) - you can experiment with different values
k = 3

# Create and fit the KMeans model
model = KMeans(n_clusters=k, random_state=42)
model.fit(X)

# Add cluster labels to the original dataset
data["Cluster"] = model.labels_

# Visualize the clusters
for cluster in range(k):
    cluster_data = data[data["Cluster"] == cluster]
    plt.scatter(cluster_data["PURCHASES"], cluster_data["CASH_ADVANCE"], label=f"Cluster {cluster}")

plt.xlabel("PURCHASES")
plt.ylabel("CASH_ADVANCE")
plt.legend()
plt.title("K-Means Clustering")
plt.show()

# Q2. Write a python program to implement hierarchical clustering algorithm.(Download
# Wholesale customers data dataset from github.com).

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from scipy.cluster.hierarchy import linkage, dendrogram
from sklearn.preprocessing import StandardScaler
from sklearn.cluster import AgglomerativeClustering

# Load the Wholesale Customers dataset (or replace with your dataset)
# Download the dataset and replace 'wholesale_customers_data.csv' with the file path
data = pd.read_csv('wholesale_customers_data.csv')

# Select the features for clustering (e.g., 'Fresh', 'Milk', 'Grocery', etc.)
# Customize this based on your dataset and analysis goals
selected_features = ['Fresh', 'Milk', 'Grocery']

# Prepare the data
X = data[selected_features]

# Standardize the data to have zero mean and unit variance
scaler = StandardScaler()
X_std = scaler.fit_transform(X)

# Perform hierarchical clustering
linkage_matrix = linkage(X_std, method='ward')

# Plot the dendrogram
plt.figure(figsize=(12, 6))
dendrogram(linkage_matrix, labels=data.index, leaf_rotation=90, leaf_font_size=12)
plt.title("Hierarchical Clustering Dendrogram")
plt.xlabel("Wholesale Customers")
plt.ylabel("Distance")
plt.show()

# Fit Agglomerative Clustering with a specific number of clusters (e.g., 3)
n_clusters = 3
model = AgglomerativeClustering(n_clusters=n_clusters)
data['Cluster'] = model.fit_predict(X_std)

# Print the clusters
for cluster_id in range(n_clusters):
    cluster_data = data[data['Cluster'] == cluster_id]
    print(f"Cluster {cluster_id}:\n{cluster_data[selected_features]}\n")

# You can explore the cluster assignments and analyze the results as needed.

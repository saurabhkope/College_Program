# Q2. Write a python program to implement hierarchical Agglomerativeclustering algorithm.
# (Download Customer.csv dataset from github.com).

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from scipy.cluster.hierarchy import dendrogram, linkage
from sklearn.cluster import AgglomerativeClustering

# Load the Customer.csv dataset
data = pd.read_csv("Customer.csv")

# Extract the features (attributes) for clustering
X = data[['Annual Income (k$)', 'Spending Score (1-100)']]

# Perform hierarchical clustering
linkage_matrix = linkage(X, method='ward')

# Plot the dendrogram
plt.figure(figsize=(10, 5))
dendrogram(linkage_matrix)
plt.title('Hierarchical Agglomerative Clustering Dendrogram')
plt.xlabel('Samples')
plt.ylabel('Distance')
plt.show()

# Fit the Agglomerative Clustering model
n_clusters = 3  # You can adjust the number of clusters as needed
model = AgglomerativeClustering(n_clusters=n_clusters, linkage='ward')
model.fit(X)

# Add cluster labels to the dataset
data['Cluster'] = model.labels_

# Display the dataset with cluster labels
print(data)

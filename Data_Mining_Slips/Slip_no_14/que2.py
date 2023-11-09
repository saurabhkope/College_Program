# Q2. Write a Python Programme to apply Apriori algorithm on Groceries dataset. Dataset
# can be downloaded from
# (https://github.com/amankharwal/Websitedata/blob/master/Groceries
# _dataset.csv).
# Also display support and confidence for each rule.

# pip install apyori
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
from apyori import apriori

store_data = pd.read_csv('Groceries_dataset.csv', header=None)

records = []
for i in range(0, 300):
    records.append([str(store_data.values[i, j]) for j in range(0, 3)])

association_rules = apriori(records, min_support=0.0045, min_confidence=0.2, min_lift=3, min_length=2)
association_results = list(association_rules)

print(len(association_results))
print(association_results[0])

for item in association_results:
    pair = item[0]
    items = [x for x in pair]
    print("Rule: " + items[0] + " -> " + items[1])
    print("Support: " + str(item[1]))
    print("Confidence: " + str(item[2][0][2]))
    print("Lift: " + str(item[2][0][3]))
    print("========================================")


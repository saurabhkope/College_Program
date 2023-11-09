# Q2. Consider following dataset
# weather=['Sunny','Sunny','Overcast','Rainy','Rainy','Rainy','Overcast','Sunny','Sunny','Rainy','Sunn
# y','Overcast','Overcast','Rainy']
# temp=['Hot','Hot','Hot','Mild','Cool','Cool','Cool','Mild','Cool','Mild','Mild','Mild','Hot','Mild']
# play=['No','No','Yes','Yes','Yes','No','Yes','No','Yes','Yes','Yes','Yes','Yes','No'].
# Use Naïve Bayes algorithm to predict [0: Overcast, 2: Mild]tuple belongs to which class
# whether to play the sports or not.

from collections import Counter
from functools import reduce

# Given dataset
weather = ['Sunny', 'Sunny', 'Overcast', 'Rainy', 'Rainy', 'Rainy', 'Overcast', 'Sunny', 'Sunny', 'Rainy', 'Sunny', 'Overcast', 'Overcast', 'Rainy']
temp = ['Hot', 'Hot', 'Hot', 'Mild', 'Cool', 'Cool', 'Cool', 'Mild', 'Cool', 'Mild', 'Mild', 'Mild', 'Hot', 'Mild']
play = ['No', 'No', 'Yes', 'Yes', 'Yes', 'No', 'Yes', 'No', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'No']

# Tuple to predict
new_weather = 'Overcast'
new_temp = 'Mild'

# Calculate prior probabilities
prior_yes = Counter(play)['Yes'] / len(play)
prior_no = Counter(play)['No'] / len(play)

# Calculate conditional probabilities for "weather"
def conditional_prob_weather(class_value):
    return Counter([weather[i] for i, val in enumerate(play) if val == class_value])[new_weather] / Counter(play)[class_value]

conditional_prob_weather_yes = conditional_prob_weather('Yes')
conditional_prob_weather_no = conditional_prob_weather('No')

# Calculate conditional probabilities for "temp"
def conditional_prob_temp(class_value):
    return Counter([temp[i] for i, val in enumerate(play) if val == class_value])[new_temp] / Counter(play)[class_value]

conditional_prob_temp_yes = conditional_prob_temp('Yes')
conditional_prob_temp_no = conditional_prob_temp('No')

# Calculate the posterior probabilities
posterior_yes = prior_yes * conditional_prob_weather_yes * conditional_prob_temp_yes
posterior_no = prior_no * conditional_prob_weather_no * conditional_prob_temp_no

# Make the prediction
prediction = 'Yes' if posterior_yes > posterior_no else 'No'

# Print the results
print('Prior Probability (Yes):', prior_yes)
print('Prior Probability (No):', prior_no)
print('Posterior Probability (Yes):', posterior_yes)
print('Posterior Probability (No):', posterior_no)
print('Prediction:', prediction)

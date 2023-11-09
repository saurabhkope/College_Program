# Q1. Draw a pie chart using R programming for the following datadistribution:
# Digits on
# Dice
# 1 2 3 4 5 6
# Frequency of
# getting each
# number
# 7 2 6 3 4 8


# Dice roll data
numbers <- c(1, 2, 3, 4, 5, 6)
frequency <- c(7, 2, 6, 3, 4, 8)

# Create a pie chart
pie(frequency, labels = numbers, main = "Dice Roll Frequencies", col = rainbow(length(numbers)))

# Add a legend
legend("topright", numbers, fill = rainbow(length(numbers))

# Add a title
title("Dice Roll Frequencies")

# Display the pie chart

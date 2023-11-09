# Q1. Write a R program to find all elements of a given list that are not inanother given list.
# = list("x", "y", "z")
# = list("X", "Y", "Z", "x", "y", "z") 

# Define the two lists
list1 <- list("x", "y", "z")
list2 <- list("X", "Y", "Z", "x", "y", "z")

# Find elements in list1 that are not in list2
elements_not_in_list2 <- list1[!(list1 %in% list2)]

# Print the result
print(elements_not_in_list2)

# output= list()


# or program

# Define the two lists
list1 <- list("x", "y", "z")
list2 <- list("X", "Y", "Z", "x", "y", "z")

# Convert the lists to vectors (if not already)
vector1 <- unlist(list1)
vector2 <- unlist(list2)

# Find elements in list1 that are not in list2
elements_not_in_list2 <- vector1[!(vector1 %in% vector2)]

# Print the result
print(elements_not_in_list2)

# output= character(0)

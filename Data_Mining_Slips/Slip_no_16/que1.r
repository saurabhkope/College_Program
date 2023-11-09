# Q1. Write a R program to create a simple bar plot of given data
# Year Export Import
# 2001 26 35
# 2002 32 40
# 2003 35 50

# Create a data frame for the given data
data <- data.frame(
  Year = c(2001, 2002, 2003),
  Export = c(26, 32, 35),
  Import = c(35, 40, 50)
)

# Create a bar plot
barplot(height = t(data[, c("Export", "Import")]),
        beside = TRUE,
        names.arg = data$Year,
        col = c("blue", "red"),
        legend.text = c("Export", "Import"),
        args.legend = list(title = "Type"))

# Add axis labels and a title
x <- c("2001", "2002", "2003")
xlabel <- "Year"
ylabel <- "Value"
title <- "Export and Import by Year"

axis(1, at = 1:3, labels = x, pos = 0)
axis(2, las = 1, at = seq(0, 60, by = 10))
title(main = title, xlab = xlabel, ylab = ylabel)

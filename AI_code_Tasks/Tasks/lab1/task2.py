john_apples = 3
mary_apples = 4
adam_apples = 6
print(f"{john_apples, mary_apples, adam_apples}")

totalApples = john_apples + mary_apples + adam_apples
print(f"Total Apples : {totalApples}")

if totalApples < 10:
    print("Total Apples is smaller than 10.")
elif totalApples == 10:
    print("Total Apples is equals to 10.")
else:
    print("Total Apples is greater than 10.")
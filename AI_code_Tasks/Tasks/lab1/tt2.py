john_app = 3
mary_app = 4
adam_app = 6
print(john_app, mary_app, adam_app)

total_apples = john_app + mary_app + adam_app
print(f"Total  : {total_apples}")

if total_apples < 10:
    print("Apples are smaller than 10.")
elif total_apples == 10:
    print("apples are equals to 10.")
else:
    print("apples is greater than 10.")
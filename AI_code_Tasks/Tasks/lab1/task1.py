def cafe_menu():
    print("New Askari Cafe, Order now from our best dishes.")

    menu = {
        1:"Chicken Burger",
        2:"Chicken Biryani",
        3:"Chicken Chezee Paratha",
        4:"Special Green Tea",
        5: "Black Cofee",

    }

    # looping on menu
    for key, value in menu.items():
        print(key, value)

    try:
        user_choice = int(input("Please select your favorite Menu Item. (e.g 3): "))
        if user_choice == 1:
            print(f"\n *** You have placed order of {menu[user_choice]} *** \n")
        elif user_choice == 2:
            print(f"\n *** You have placed order of {menu[user_choice]} *** \n")
        elif user_choice == 3:
            print(f"\n *** You have placed order of {menu[user_choice]} *** \n")
        elif user_choice == 4:
            print(f"\n *** You have placed order of {menu[user_choice]} *** \n")
        elif user_choice == 5:
            print(f"\n *** You have placed order of {menu[user_choice]} *** \n")
        else:
            print(f"\n ** x Menu Item Not Found x ** \n")
    except Exception as e :
        print(e)
        print("\n *** X Please enter a valid number. X *** \n")
    
cafe_menu()





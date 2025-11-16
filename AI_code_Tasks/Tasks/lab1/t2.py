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
        for i in range(1,len(menu)+1):
            
            if user_choice == i:
                print(f"\n *** You have placed order of {menu[user_choice]} *** \n")
                break
                
            else:
                print(f"\n ** x Item not Found x ** \n")
                

      
    except Exception as e :
        print(e)
        print("\n *** X Please enter a valid number. X *** \n")
    

cafe_menu()





import random
class playinggame():
    def generaterandomnumber(self):
        global a
        a=random.randint(0,100)
        print(a)
        return a
    global flag
    flag=0

    def enternumber(self):
        count=0
        N=0
        while(count==N):
            b=int(input("Enter the number:\n"))
            while(a!=b):
                if(b>a):
                    print('''You guess the higher number
HINT: Try to minimize the number''')
                else:
                    print('''you guess the lower number
HINT: Try to maximize the number''') 
                break   
            flag+1
                 
            if(a==b):
                print("CONGRATS!! You guess the correct number")
                count+=1
    def numberofguess(self):               
        if(flag<=5):
            print("You guess the correct number in round 1")
        elif(flag>5 and flag<10):
            print("You guess the correct number in round 2") 
        else:
            print("You guess the correct number in round 3")
    
class playagain(playinggame):
    def again(self):
        s=input("Do you want to play the game again(yes or no):\n")
        if(s.upper()=="YES"):
            playinggame.generaterandomnumber(self)
            playinggame.enternumber(self)
            playinggame.numberofguess(self)
            playagain.again(self)    
        else:
            print("Code runs successfully")



#Driver code
game=playagain()
game.generaterandomnumber()
game.enternumber()
game.numberofguess()
game.again()


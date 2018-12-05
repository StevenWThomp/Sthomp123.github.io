#!/usr/bin/env python3
# main_program.py
# Steven Thompson
# November 6 2017

""" This program draws a house in the dark """
 
import pygame
import random
 
# Define some colors
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
GREEN = (0, 255, 0)
RED = (255, 0, 0)
DARK_BLUE = (13, 7, 124)
GROUND_GREEN = (14,104,16)
BRICK = (132, 67, 54)
CHIMNEY = (124, 25, 1)
GRAY = (124, 122, 122)
 
pygame.init()
 
# Set the width and height of the screen [width, height]
size = (700, 500)
screen = pygame.display.set_mode(size)
 
pygame.display.set_caption("My picture")
 
# Loop until the user clicks the close button.
done = False
 
# Used to manage how fast the screen updates
clock = pygame.time.Clock()
 
# -------- Main Program Loop -----------
while not done:
    # --- Main event loop
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True
 
    
    
    screen.fill(WHITE)
 
    
    
    #This draws the ground and the sky
    pygame.draw.rect(screen, GROUND_GREEN,[0,0,700,500])    
    pygame.draw.rect(screen, DARK_BLUE,[0,0,700,250])
    

    #This draws the sun
    pygame.draw.circle(screen, WHITE, (650, 60), 40, 0)
    
    
    #This draws the snow around the house
    for snow_y in range(500):
        snow_x = random.randint(1,700)
        pygame.draw.circle(screen, WHITE,(snow_x,snow_y), 1,0)


    #This draws the house
    pygame.draw.rect(screen, BRICK, [200,100, 200, 150],0)
    
    #This draws the first window to the house
    pygame.draw.rect(screen, BLACK, [220, 125, 50, 50], 0)
    
    #This draws the second window to the house
    pygame.draw.rect(screen, BLACK, [320, 125, 50, 50], 0)
    
    #This draws the door to the house
    pygame.draw.rect(screen, BLACK, [270, 200, 50, 50], 0)
    
    
    #This draws the smoke for the chimney
    for smoke_y in range(0,51):
        smoke_x = random.randint(355,370)
        pygame.draw.circle(screen, GRAY, (smoke_x,smoke_y), 10, 0)
    #This draws the chimney
    pygame.draw.rect(screen, CHIMNEY, [350,50, 25, 50], 0)
    
    
    #This draws the roof of my house
    pygame.draw.polygon(screen, BLACK, [[300,25], [200,100], [400,100]],0)
    
    

    #Updates the screen with what is drawn
    pygame.display.flip()

    #limits framerate to 60
    clock.tick(60)
 
# Close the window and quit.
pygame.quit()

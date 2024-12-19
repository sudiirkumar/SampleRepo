import os

user_input = input("Enter a filename to delete: ") # Unsafe input
os.system(f"rm {user_input}") # Vulnerable to command injection

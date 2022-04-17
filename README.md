# data structure and algo playground 

### implementing data structures and algo in java 

### Keep learning, practicing and building. Engineering is fun! 


--
PS>ssh-keygen -t rsa -b 4096 -C "my@emailaddress.com"
Generating public/private rsa key pair.
Enter file in which to save the key (//.ssh/id_rsa)

$ ssh-add ~/.ssh/id_rsa_key  
Add your private key using ssh-add
Enter passphrase for /home/user/.ssh/id_rsa
Identity added: /home/user/.ssh/id_rsa

--
start ssh-agent
eval `ssh-agent -s`
ssh-add

--

perrmenantly authenticate with git repo
git config --global credential.helper store
git push https://github.com/<your_username>/<your_repo>.git



--
https://medium.com/clarusway/how-to-use-git-github-without-asking-for-authentication-always-passwordless-usage-of-private-git-8c32489bc2e9
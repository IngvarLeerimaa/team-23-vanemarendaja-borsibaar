# Run Guide

So running this was trickier than I thought. I had to jump through some hoops to get it going, so here's a guide for when you want to get it up and running yourself. I'm sure there's something I'm missing and there's probably a more elegant way to do things — I'm still learning about this project and I'm sure we'll find a better workflow together.

I use IntelliJ for backend, and for this project I opened VSCode in WSL to run the frontend. This is after playing with Dockerfiles and other options for a while. I also found an old computer I'm using at home, so I've included some hints about configuring your environment from scratch.

## Prerequisites

- IntelliJ Ultimate (you can get a free trial, so give it a shot!)
- VSCode (Ubuntu/WSL)
- Git
- Docker Desktop
- OpenSSL for JWT generation (or let AI generate something for you 🤖)
- Google OAuth credentials

## Backend

1. Clone/fork the repo and import it into your IDE of choice — I also created a separate branch for testing
2. If needed, add an SDK (it's really easy in IntelliJ). I used Eclipse Temurin 21: `File → Project Structure → Project`
3. If Spring isn't detected: `Project Structure → Modules → + → Import Module → select pom.xml from ./backend`
4. Try running: `./mvnw clean package`

Running Docker is just `docker compose up` and later `docker compose down`. You can also remove `version` from the start of docker-compose.yml since it's deprecated syntax.

### If you haven't used Java before

Find your JDK path — if downloaded through IntelliJ it's probably somewhere like:

```
C:\Users\<your_user>\.jdks\<java_version>
```

Then:

1. Search "Environment Variables" in Windows
2. Add new system variable: `JAVA_HOME` = your JDK path
3. Edit `Path` → add `%JAVA_HOME%\bin`
4. Restart your terminal (might need to restart IDE too)

### Create a `.env` file

Here's my setup:

```dotenv
POSTGRES_DB=borsibaar
POSTGRES_USER=borsibaar
POSTGRES_PASSWORD=borsibaar123

SPRING_DATASOURCE_USERNAME=borsibaar
SPRING_DATASOURCE_PASSWORD=borsibaar123

GOOGLE_CLIENT_ID=from cloud.google.com
GOOGLE_CLIENT_SECRET=from cloud.google.com

JWT_SECRET=<generate with: "openssl rand -base64 32 or ask ai for a random one">
```

### Setting up Google OAuth

1. Go to [Google Cloud Console](https://console.cloud.google.com/)
2. Create a new project (or select an existing one)
3. Navigate to `APIs & Services → Credentials`
4. Click `Create Credentials → OAuth client ID`
5. Select "Web application" as the application type
6. Add authorized redirect URIs (e.g., `http://localhost:8080/login/oauth2/code/google`)
7. Copy your Client ID and Client Secret into your `.env` file

>  **Note:** Running the backend locally outside of Docker will produce some errors. I haven't really looked into it yet.

## Frontend

Install npm & Node.js if needed, then:

1. Open another IDE window in `./frontend`
2. Run `npm install`
3. Run `npm run dev`

> `npm install` might take a while. Grab a coffee.

Now it should be running fine — have a look around!

## IntelliJ Tips for New Users

- `Double-tap Shift` — search everything
- `Ctrl + Shift + F` — find in files
---

If you find a better workflow, please let me know

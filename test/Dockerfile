# Use a lightweight Node.js image
FROM node:16-slim

# Create a directory to hold the application
WORKDIR /my-app/test/

# Copy your local files to the container
COPY . .

# Install a simple HTTP server to serve our content
RUN npm install -g http-server

# Expose port 8080
EXPOSE 3000

# Run the HTTP server
CMD [ "http-server", "-c-1" ]
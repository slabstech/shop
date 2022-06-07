# React Shop

* Steps followed to configure setup
  * In Empty Directory, Create starter ReactJS App
    * npx create-react-app shop
  * Verfiy application run at localhost:3000
    * cd shop
    * npm start
  * Install gh-pages dependency
    * npm install gh-pages --save-dev
  * Update package.json with configs
    * To locate home page
      * "homepage": "https://slabstech.github.io/shop",
    * Deployment scripts in scripts tags
      * "predeploy": "npm run build", "deploy": "gh-pages -d build", 
  * To deploy app to github
    * npm run deploy
  * To deploy app to github with commit message
    * npm run deploy -- -m "Setup of ReactJS GHPages"

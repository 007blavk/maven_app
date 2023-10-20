def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    echo 'testing the application...'
    echo 'testing the application again again againnnnn...'    
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
    echo 'deploying the application...'
} 

return this

def call() {
    sh '''
        sudo apt-get update -y
        sudo apt-get install -y python3 python3-pip
        python3 -m pip install --upgrade pip
    '''
}

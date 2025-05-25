def call() {
    sh '''
        sudo apt-get update -y
        sudo apt-get install -y python3 python3-pip python3-venv
        python3 -m venv venv
        . venv/bin/activate
        pip install --upgrade pip
    '''
}

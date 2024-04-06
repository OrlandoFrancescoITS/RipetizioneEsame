from flask import Flask, jsonify, request
from http import HTTPStatus

app = Flask(__name__)

Computers = [
    {
        "id" : 1,
        "manifacturer" : "Asus",
        "model" : "X53SD"
    },
    {
        "id" : 2,
        "manifacturer" : "Asus",
        "model" : "F555UJ"
    },
    {
        "id" : 3,
        "manifacturer" : "Asus",
        "model" : "Vivobook Pro 16X"
    }
]

@app.route('/', methods=["GET"])
def getAll():
    return Computers


@app.route('/<int:id>', methods=["GET"])
def getById(id):
    for computer in Computers:
        if computer["id"] == id:
            return jsonify(computer)
        
@app.route('/', methods=["POST"])
def addNewComputer():
    newComputer = request.json
    Computers.append(newComputer)
    return "computer aggiunto" 

@app.route('/<int:id>', methods=["PUT"])
def updatePc(id):
    editedComputer = request.json
    for computer in Computers:
        if computer["id"] == id:
            computer.update(editedComputer)
            return "computer modificato"
    return "computer non modificato"    

@app.route('/<int:id>', methods=["DELETE"])
def delete(id):
    for computer in Computers:
        if computer["id"] == id:
            Computers.remove(computer)
            return "Computer eliminato"
    return "computer non modificato"    
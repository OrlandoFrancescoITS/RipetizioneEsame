console.log("hello js!")

let gallery = document.getElementById("gallery");

i=0

function add(){
    i++
    let newImage = document.createElement("img");
    newImage.setAttribute("src", "https://picsum.photos/200/300?random=" + i);
    gallery.appendChild(newImage);
}

function remove(){
    gallery.removeChild(gallery.lastChild)
}
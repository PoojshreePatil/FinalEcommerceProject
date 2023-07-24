const login = () =>{
    let u = document.getElementById('user').value;
    let pw = document.getElementById('password').value;
    if(u.length > 0 && pw.length> 0)
    {
        alert('Login Successfully......');
        window.location.href="./home.html";
    }
}
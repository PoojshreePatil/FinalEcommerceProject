const signin = () => {
    let e = document.getElementById('email').value;
    let p = document.getElementById('pass').value;
    let rp = document.getElementById('rpass').value;

    if(e.length > 0 && p.length > 0)
    {
        if(p === rp)
        {
            alert('Account Created Successfully....');
            window.location.href="/";
        

        }
        else{
            alert('Enter valid password');
        }
    }
}
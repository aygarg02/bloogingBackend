import React from 'react'; 
import './styleform.css';
const Basic=()=>{
return(
    <div className='form'>
     <form method='POST'>
    <label htmlFor="gandu">Username:</label><br />
    <input type="Name" id="username" name="username"/><br/><br/>
    
    <label htmlFor="password">Password:</label><br/>
    <input type="password" id="password" name="password"/><br/><br/>
    
    <input type="submit" value="create"/>
  </form>

    </div>
)


}
export default Basic;
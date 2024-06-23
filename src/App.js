
import './App.css';
import { Routes,Route } from 'react-router-dom';
import Basic from './Component/newUser';
import BasicForm  from './Component/form';
import Sending from './Component/retrive'; 
import Ingredeints from './Component/list'
function App() {
  return (
    <>
    <h2>design a taco! </h2>
    <img src="image.png" alt="My Image" />
  <Ingredeints/>
     </>
      
  );
}

export default App;

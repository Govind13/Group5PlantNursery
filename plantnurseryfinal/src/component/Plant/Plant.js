import { Button } from "@mui/material";
import {useNavigate} from"react-router-dom";
import React from "react";
import './plant.css'
const Plant =()=>{
    const navigate = useNavigate();
    return(
        <form>
        <div>
            <h1>Plant</h1>
            <ul><Button variant="outlined" color="success"  onClick={()=>navigate('/Plant/Add')} >Add Plant</Button></ul>
            <ul><Button variant="outlined" color="error" onClick={()=>navigate('/Plant/Update')}>Update Plant</Button></ul>
            <ul><Button variant="outlined" color="warning" onClick={()=>navigate('/Plant/Delete')}>Delete Plant</Button></ul>
            <ul><Button variant="outlined" color="secondary" onClick={()=>navigate('/Plant/PlantViewAll')} >View Plant</Button></ul>
        </div>
        </form>
    )

}

export default Plant;
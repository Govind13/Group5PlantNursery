import { Button } from "@mui/material";
import {useNavigate} from"react-router-dom";
import React from "react";
import './planter.css'
const Planter =()=>{
    const navigate = useNavigate();
    return(
        <form>
        <div>
            Planter
            <ul><Button variant="outlined" color="success" onClick={()=>navigate('/Planter/Add')} > Planter Add</Button></ul>
            <ul><Button variant="outlined" color="error" onClick={()=>navigate('/Planter/Update')}>Planter Update</Button></ul>
            <ul><Button variant="outlined" color="warning" onClick={()=>navigate('/Planter/Delete')}>Planter Delete</Button></ul>
            <ul><Button variant="outlined" color="secondary" onClick={()=>navigate('/Planter/ViewAll')} >View All Planter </Button></ul>
            <ul><Button variant="outlined" color="secondary" onClick={()=>navigate('/Planter/PlanterPlantAdd')} >Add Plant </Button></ul>
        </div>
        </form>
    )

}

export default Planter;
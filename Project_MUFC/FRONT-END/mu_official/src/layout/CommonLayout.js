import { Outlet } from "react-router-dom";
import React from "react";
const CommonLayout = () => {
    return (
        <>
            {/*<Header/>*/}
            <div  className="page-container" >
                <Outlet/>
            </div>
            {/*<Footer/>*/}
        </>
    )
};

export default CommonLayout;
